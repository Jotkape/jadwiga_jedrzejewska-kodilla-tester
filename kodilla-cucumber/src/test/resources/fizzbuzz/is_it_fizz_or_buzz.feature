Feature:  Is it divisible by 3 or 5?

 Scenario Outline: Number is or isn't divisible by 3 or 5

    Given number is <number>
    When  I ask whether it's divisible by 3 or 5
    Then  I should get answer <answer>
    Examples:
      | number | answer |
      | 0 | "FizzBuzz" |
      | 2 | "None" |
      | 3 | "Fizz" |
      | 9 | "Fizz" |
      | 27 | "Fizz" |
      | 5 | "Buzz" |
      | 10 | "Buzz" |
      | 20 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 30 | "FizzBuzz" |
      | 60 | "FizzBuzz" |