fun main() {
    while (true) {
        print("Input 1 for encryption, 2 for decryption, or 3 to exit: ")
        while (true) {
            val op = readln()
            when (op) {
                "1" -> {
                    print("Input string to encrypt: ")
                    val input = readln()
                    print("Input encryption length from 1 to 256: ")
                    while (true) {
                        val key = readln().toInt()
                        if (key in 0..255) {
                            println(enc(input, key))
                            break
                        } else {
                            print("Please input a number between 1 and 256: ")
                            continue
                        }
                    }
                    break
                }

                "2" -> {
                    print("Input string to decrypt: ")
                    val input = readln()
                    println(dec(input))
                    break
                }

                "3" -> {
                    println("\n\to/\n");print(0 / 0)
                }

                "4" -> {
                    println("\u0394")
                    break
                }

                else -> {
                    print("Please input 1, 2, or 3: ")
                    continue
                }
            }
        }
    }
}