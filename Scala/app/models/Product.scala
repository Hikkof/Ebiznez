package models

import collection.mutable

object Product {
  private var nOfProducts: Long = 1  // NOT equal to products.size but a lazy variable to give each new prodct unique key
  private val products = mutable.Map(nOfProducts -> List("test"))
  
  def addProduct(name: String): Long = {
    nOfProducts = nOfProducts + 1
    products(nOfProducts) = List(name)
    return nOfProducts
  }

  def getProduct(id: Long): Seq[String] = {
    if (products.keySet.exists(_ == id)) {
      products(id)
    }
    else {
      Nil
    }
  }

  def deleteProduct(id: Long): Unit = {
    products - id
  }
  
  def updateProduct(id: Long, name: String): Unit = {
    if (products.keySet.exists(_ == id)) {
      products(id) = List(name)
    }
  }
}