fun dec(input: String): String {
    var out = ""
    val key = "${input[0]}${input[1]}".toInt(16)
    var pos = 2
    for (i in 0..<((input.length - 2) / ((key + 1) * 2))) {
        var hex = "${input[pos]}"
        pos += key + 1
        hex += input[pos]
        pos += key + 1
        out += (hex.toInt(16)).toChar()
    }
    return out
}