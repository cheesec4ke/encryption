fun enc(input: String, key: Int): String {
    val lines = arrayOf('|', 'ǀ', '│', '❘', 'ㅣ', '∣', '〡', '⎜', '⎟', '⎢', '⎥', '⎪', '⎮', '⎸', '⎹', '⏐')
    var out = ""
    out += Integer.toHexString(key).padStart(2, '0')
    for (i in input.indices) {
        out += Integer.toHexString((input[i]).code)[0]
        repeat(key) {
            out += Integer.toHexString((0..15).random())
        }
        out += Integer.toHexString((input[i]).code)[1]
        repeat(key) {
            out += Integer.toHexString((0..15).random())
        }
    }
    var out2 = ""
    for (i in out.indices) {
        out2 += lines[out[i].toString().toInt(16)]
    }
    return out2
}