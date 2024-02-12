fun enc(input: String, key: Int): String {
    var out = ""
    if (key < 16) {
        out += 0
        out += Integer.toHexString(key)
    } else {
        out += Integer.toHexString(key)
    }
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
    return out
}