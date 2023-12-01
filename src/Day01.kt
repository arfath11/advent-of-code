fun main() {

    fun findFirstDig(word: String): Int {
        var ans = 0
        for(ch in word)

            if(ch.isDigit())
            {
                ans = ch.code - '0'.code
                break
            }

        return ans

    }


    fun part1(input: List<String>): Int {
        var ans = 0
        for(word in input){
            var digCheck = false
            for(ch in word ){
                if(ch.isDigit())
                    digCheck = true
            }

            if(!digCheck)
                continue
            var frsDig =    findFirstDig(word)
            var lastdig = findFirstDig(word.reversed())
            ans += (frsDig * 10 + lastdig)





        }
        
        return ans
    }




    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:

//    val testInput = readInput("Day01_test")
//    print(part1(testInput))
//    check(part1(testInput) == 142)

    val input = readInput("Day01")
    part1(input).println()
//    part2(input).println()
}
