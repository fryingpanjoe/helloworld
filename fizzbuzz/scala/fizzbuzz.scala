object FizzBuzz extends Application {
  for (i <- 1 to 100) {
    Console.println(if (i % 15 == 0) "FizzBuzz"
                    else if (i % 3 == 0) "Fizz"
                    else if (i % 5 == 0) "Buzz"
                    else i.toString())
  }
}
