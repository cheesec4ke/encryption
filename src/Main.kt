fun main() {
    while (true) {
        print("Input 1 for encryption, 2 for decryption, or 3 to exit: ")
        while (true) {
            val op = readln()
            when (op) {
                "1" -> {
                    print("Input text to encrypt: ")
                    val input = readln()
                    print("Input encryption length from 1 to 256: ")
                    while (true) {
                        try {
                            val key = readln().toInt() - 1
                            if (key in 0..255) {
                                println("Encrypted string:\n\t${enc(input, key)}\n")
                                break
                            } else {
                                print("Please input a number between 1 and 256: ")
                            }
                        } catch (e: NumberFormatException) {
                            print("Please input a number between 1 and 256: ")
                        }
                    }
                    break
                }

                "2" -> {
                    print("Input string to decrypt: ")
                    val input = readln()
                    println("Decrypted text:\n\t${dec(input)}\n")
                    break
                }

                "3" -> {
                    println("\n\to/\n");print(0 / 0)
                }

                else -> {
                    print("Please input 1, 2, or 3: ")
                }
            }
        }
    }
}