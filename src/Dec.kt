fun dec(input: String): String {
    val lines = arrayOf('|', 'ǀ', '│', '❘', 'ㅣ', '∣', '〡', '⎜', '⎟', '⎢', '⎥', '⎪', '⎮', '⎸', '⎹', '⏐')
    var input2 = ""
    for (i in input.indices) {
        input2 += Integer.toHexString(lines.indexOf(input[i]))
    }
    var out = ""
    val key = "${input2[0]}${input2[1]}".toInt(16) + 1
    var pos = 2
    for (i in 0..<((input2.length - 2) / ((key) * 2))) {
        var hex = input2[pos].toString()
        pos += key
        hex += input2[pos]
        pos += key
        out += (hex.toInt(16)).toChar()
    }
    return out
}