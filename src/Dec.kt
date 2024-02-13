fun dec(input: String): String {
    //("\u007c", "\u01c0", "\u2502", "\u2758", "\u3163", "\u2223", "\u3021", "\u239c", "\u239f", "\u23a2", "\u23a5", "\u23aa", "\u23ae", "\u23b8", "\u23b9", "\u23d0")
    val lines = arrayOf("|", "ǀ", "│", "❘", "ㅣ", "∣", "〡", "⎜", "⎟", "⎢", "⎥", "⎪", "⎮", "⎸", "⎹", "⏐")
    var input2 = ""
    for (i in input.indices) {
        input2 += Integer.toHexString(lines.indexOf("${input[i]}"))
    }
    var out = ""
    val key = "${input2[0]}${input2[1]}".toInt(16)
    var pos = 2
    for (i in 0..<((input2.length - 2) / ((key + 1) * 2))) {
        var hex = "${input2[pos]}"
        pos += key + 1
        hex += input2[pos]
        pos += key + 1
        out += (hex.toInt(16)).toChar()
    }
    return out
}