fun main() {
    val lines = arrayOf('|', 'ǀ', '│', '❘', 'ㅣ', '∣', '〡', '⎜', '⎟', '⎢', '⎥', '⎪', '⎮', '⎸', '⎹', '⏐')
    //("\u007c", "\u01c0", "\u2502", "\u2758", "\u3163", "\u2223", "\u3021", "\u239c", "\u239f", "\u23a2", "\u23a5", "\u23aa", "\u23ae", "\u23b8", "\u23b9", "\u23d0")
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
                                println("Encrypted string:\n\n\t${enc(input, key)}\n")
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
                    while (true) {
                        val input = readln()
                        if (input[0] in lines) {
                            println("Decrypted text:\n\n\t${dec(input)}\n")
                            break
                        } else {
                            print("Please input a valid input string: ")
                        }
                    }
                    break
                }

                "3" -> {
                    println("\n\to/\n")
                    print(0 / 0)
                }

                else -> {
                    print("Please input 1, 2, or 3: ")
                }
            }
        }
    }
}