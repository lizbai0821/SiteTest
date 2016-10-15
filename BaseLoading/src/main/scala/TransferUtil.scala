/**
  * Created by lizbai on 15/10/16.
  */
object TransferUtil {
  def LongTransfer(numString: String): Long = {
    if ("".equals(numString)) {
      0
    } else {
      numString.toLong
    }
  }

  def IntTransfer(numString: String): Int = {
    if ("".equals(numString)) {
      0
    } else {
      numString.toInt
    }
  }

  def patitionKeyTransfer(numString: String): String = {
    if ("".equals(numString)) {
      "NULL"
    } else {
      numString.substring(numString.length - 1)
    }
  }


  def BigIntTransfer(numString: String): BigInt = {
    if ("".equals(numString)) {
      0
    } else {
      BigInt.apply(numString)
    }
  }
}
