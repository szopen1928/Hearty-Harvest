object HeartyHarvest {

  // 1. Define a function that divides two numbers
  def divide(num1: Int, num2: Int) : Int = {
    num1 / num2
  }
  
  // 2. Define a function that multiplies two numbers
  def multiply(num1: Int, num2: Int) : Int = {
    num1 * num2
  }
  
  // 3. Define a function that subtracts two numbers
  def subtract(num1: Int, num2: Int) : Int = {
    num1 - num2
  }
  
  // 4. Define a function that adds two numbers
  def add(num1: Int, num2: Int) : Int = {
    num1 + num2
  }
  
  // 5. Define a function that calculates the square of a number
  def square(num: Int) : Int = {
    num * num
  }
  
  // 6. Define a function that calculates the cube of a number
  def cube(num: Int) : Int = {
    num * num * num
  }
  
  // 7. Define a function that calculates the square root of a number
  def squareRoot(num: Int) : Double = {
    math.sqrt(num)
  }
  
  // 8. Define a function that calculates the cube root of a number
  def cubeRoot(num: Int) : Double = {
    math.cbrt(num)
  }
  
  // 9. Define a function that calculates the remainder of two numbers
  def remainder(num1: Int, num2: Int) : Int = {
    num1 % num2
  }
  
  // 10. Define a function that calculates the average of two numbers
  def average(num1: Int, num2: Int) : Double = {
    (num1 + num2) / 2.0
  }
  
  // 11. Define a function that calculates the exponent of a number
  def exponent(num: Int, exp: Int) : Int = {
    math.pow(num, exp).toInt
  }
  
  // 12. Define a function that calculates the modulus of two numbers
  def modulus(num1: Int, num2: Int) : Int = {
    num1 % num2
  }
  
  // 13. Define a function that calculates the log of a number
  def log(num: Double) : Double = {
    math.log(num)
  }
  
  // 14. Define a function that calculates the natural log of a number
  def naturalLog(num: Double) : Double = {
    math.log1p(num)
  }
  
  // 15. Define a function that calculates the base-2 log of a number
  def base2Log(num: Double) : Double = {
    math.log10(num)
  }
  
  // 16. Define a function that calculates the base-10 log of a number
  def base10Log(num: Double) : Double = {
    math.log10(num)
  }
  
  // 17. Define a function that calculates the ceiling of a number
  def ceiling(num: Int) : Int = {
    math.ceil(num).toInt
  }
  
  // 18. Define a function that calculates the floor of a number
  def floor(num: Int) : Int = {
    math.floor(num).toInt
  }
  
  // 19. Define a function that calculates the factorial of a number
  def factorial(num: Int) : BigInt = {
    if(num == 0) 1 else num * factorial (num-1)
  }
  
  // 20. Define a function that calculates the range between two numbers
  def range(num1: Int, num2: Int) : Seq[Int] = {
    num1 to num2
  }
  
  // 21. Define a function that calculates the mean of a set of numbers
  def mean(seq: Seq[Int]) : Double = {
    seq.sum.toDouble / seq.size.toDouble
  }
  
  // 22. Define a function that calculates the median of a set of numbers
  def median(seq: Seq[Int]) : Double = {
    val (lower, upper) = seq.sortWith(_<_).splitAt(seq.size / 2)
    if (seq.size % 2 == 0) (lower.last + upper.head) / 2.0 else upper.head
  }
  
  // 23. Define a function that calculates the mode of a set of numbers
  def mode(seq: Seq[Int]) : Int = {
    seq.groupBy(identity).mapValues(_.size).maxBy(_._2)._1
  }
  
  // 24. Define a function that calculates the standard deviation of a set of numbers
  def stdDev(seq: Seq[Int]) : Double = {
    val m = mean(seq)
    math.sqrt(seq.map(x => math.pow(x - m, 2)).sum / seq.size)
  }
  
  // 25. Define a function that calculates the variance of a set of numbers
  def variance(seq: Seq[Int]) : Double = {
    val m = mean(seq)
    seq.map(x => math.pow(x - m, 2)).sum / seq.size
  }
  
  // 26. Define a function that calculates the sum of a set of numbers
  def sum(seq: Seq[Int]) : Int = {
    seq.sum
  }
  
  // 27. Define a function that calculates the product of a set of numbers
  def product(seq: Seq[Int]) : Int = {
    seq.product
  }
  
  // 28. Define a function that calculates the sum of squares of a set of numbers
  def sumOfSquares(seq: Seq[Int]) : Int = {
    seq.map(x => x * x).sum
  }
  
  // 29. Define a function that calculates the difference between two sets of numbers
  def difference(seq1: Seq[Int], seq2: Seq[Int]) : Seq[Int] = {
    seq1.diff(seq2)
  }
  
  // 30. Define a function that calculates the intersection between two sets of numbers
  def intersection(seq1: Seq[Int], seq2: Seq[Int]) : Seq[Int] = {
    seq1.intersect(seq2)
  }
  
  // 31. Define a function that calculates the product of two sets of numbers
  def productOfSeqs(seq1: Seq[Int], seq2: Seq[Int]) : Seq[Int] = {
    seq1.zip(seq2).map{case (x, y) => x * y}
  }
  
  // 32. Define a function that calculates the absolute value of a number
  def absoluteValue(num: Int) : Int = {
    math.abs(num)
  }
  
  // 33. Define a function that calculates the sign of a number
  def sign(num: Int) : Int = {
    math.signum(num).toInt
  }
  
  // 34. Define a function that calculates the round of a number
  def round(num: Double) : Int = {
    math.round(num).toInt
  }
  
  // 35. Define a function that calculates the hypotenuse of a triangle
  def hypotenuse(side1: Double, side2: Double) : Double = {
    math.hypot(side1, side2)
  }
  
  // 36. Define a function that calculates the dot product of two sets of numbers
  def dotProduct(seq1: Seq[Int], seq2: Seq[Int]) : Int = {
    seq1.zip(seq2).map{case (x, y) => x * y}.sum
  }
  
  // 37. Define a function that calculates the dot product of a matrix
  def dotProductMatrix(matrix1: Seq[Seq[Int]], matrix2: Seq[Seq[Int]]) : Seq[Seq[Int]] = {
    matrix1.map{row1 =>
      matrix2.transpose.map { row2 =>
        (row1, row2).zipped.map(_*_).sum
      }
    }
  }
  
  // 38. Define a function that calculates the sum of a matrix
  def matrixSum(matrix: Seq[Seq[Int]]) : Int = {
    matrix.flatten.sum
  }
  
  // 39. Define a function that calculates the transpose of a matrix
  def matrixTranspose(matrix: Seq[Seq[Int]]) : Seq[Seq[Int]] = {
    matrix.transpose
  }
  
  // 40. Define a function that calculates the inverse of a matrix
  def matrixInverse(matrix: Seq[Seq[Int]]) : Seq[Seq[Int]] = {
    val det = matrixDeterminant(matrix)
    val cofactorMatrix = matrixCofactor(matrix)
    cofactorMatrix.map(_.map(x => x/det))
  }
  
  // 41. Define a function that calculates the determinant of a matrix
  def matrixDeterminant(matrix: Seq[Seq[Int]]) : Int = {
    matrix.length match {
      case 2 => matrix(0)(0) * matrix(1)(1) - matrix(0)(1) * matrix(1)(0)
      case _ => 
        matrix(0).zipWithIndex.map {
          case (element, columnIndex) => 
            val minorMatrix = (1 until matrix.length).map(row => matrix(row).zipWithIndex.filter(_._2 != columnIndex).map(_._1))
            element * matrixDeterminant(minorMatrix) * (-1) ** columnIndex
        }.sum
    }
  }
  
  // 42. Define a function that calculates the cofactor of a matrix
  def matrixCofactor(matrix: Seq[Seq[Int]]) : Seq[Seq[Int]] = {
    (0 until matrix.length).map { row =>
      (0 until matrix.length).map { column =>
        val minorMatrix = (0 until matrix.length).filter(_ != row).map(row1 => matrix(row1).zipWithIndex.filter(_._2 != column).map(_._1))
        val minorDeterminant = matrixDeterminant(minorMatrix)
        minorDeterminant * (-1) ** (row + column) 
      }
    }
  }
  
  // 43. Define a function that calculates the length of a vector
  def vectorLength(v: Seq[Double]) : Double = {
    math.sqrt(v.map(x => x * x).sum)
  }
  
  // 44. Define a function that calculates the angle between two vectors
  def vectorAngle(v1: Seq[Double], v2: Seq[Double]) : Double = {
    math.acos((v1.zip(v2).map{case (x, y) => x * y}.sum) / (vectorLength(v1) * vectorLength(v2)))
  }
  
  // 45. Define a function that calculates the cross product of two vectors
  def vectorCrossProduct(v1: Seq[Double], v2: Seq[Double]) : Seq[Double] = {
    val c1 = v1(1) * v2(2) - v1(2) * v2(1)
    val c2 = v1(2) * v2(0) - v1(0) * v2(2)
    val c3 = v1(0) * v2(1) - v1(1) * v2(0)
    Seq(c1, c2, c3)
  }
  
  // 46. Define a function that calculates the dot product of two vectors
  def vectorDotProduct(v1: Seq[Double], v2: Seq[Double]) : Double = {
    v1.zip(v2).map{case (x, y) => x * y}.sum
  }
  
  // 47. Define a function that calculates the projection of two vectors
  def vectorProjection(v1: Seq[Double], v2: Seq[Double]) : Seq[Double] = {
    val top = vectorDotProduct(v1, v2)
    val bottom = vectorLength(v2) * vectorLength(v2)
    v2.map(_ * (top/bottom))
  }
  
  // 48. Define a function that calculates the unit vector of a given vector
  def vectorUnit(v: Seq[Double]) : Seq[Double] = {
    v.map(_ / vectorLength(v))
  }
  
  // 49. Define a function that calculates the normalization of a vector
  def vectorNormalize(v: Seq[Double]) : Seq[Double] = {
    val mean = v.sum / v.size
    v.map(x => (x - mean)/v.map(x => math.abs(x - mean)).max)
  }
  
  // 50. Define a function that calculates the orthogonal of two vectors
  def vectorOrthogonal(v1: Seq[Double], v2: Seq[Double]) : Seq[Double] = {
    val projected = vectorProjection(v1, v2)
    v1.zip(projected).map{ case (x, y) => x - y }
  }
  
  // 51. Define a function that calculates the scalar multiple of a vector
  def vectorScalarMultiple(v: Seq[Double], scalar: Double) : Seq[Double] = {
    v.map(_ * scalar)
  }
  
  // 52. Define a function that calculates the addition of two vectors
  def vectorAddition(v1: Seq[Double], v2: Seq[Double]) : Seq[Double] = {
    v1.zip(v2).map{case (x, y) => x + y}
  }
  
  // 53. Define a function that calculates the subtraction of two vectors
  def vectorSubtraction(v1: Seq[Double], v2: Seq[Double]) : Seq[Double] = {
    v1.zip(v2).map{case (x, y) => x - y}
  }