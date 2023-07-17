package com.heartyharvest

// imports
import scala.collection.mutable.ListBuffer

object HeartyHarvest {

  // constants
  val MAX_TREES = 2

  // methods
  // method to get the trees in the forest
  def getTrees(forest: List[String]): List[String] = {
    val trees = ListBuffer[String]()
    forest.foreach { tree =>
      if (trees.size < MAX_TREES) {
        trees += tree
      }
    }
    trees.toList
  }

  // method to harvest the trees
  def harvestTrees(trees: List[String]): List[String] = {
    val harvestedTrees = ListBuffer[String]()
    trees.foreach { tree =>
      harvestedTrees += tree + " (harvested)"
    }
    harvestedTrees.toList
  }

  // method to print the harvested trees
  def printHarvestedTrees(harvestedTrees: List[String]): Unit = {
    harvestedTrees.foreach { tree =>
      println("Harvested tree: " + tree)
    }
  }

  // main method
  def main(args: Array[String]): Unit = {
    // get the forest
    val forest = List("Oak", "Pine", "Maple", "Birch")

    println("Forest: " + forest.mkString(", "))
    // get the trees
    val trees = getTrees(forest)
    println("Trees to be harvested: " + trees.mkString(", "))
    // harvest the trees
    val harvestedTrees = harvestTrees(trees)
    // print the harvested trees
    printHarvestedTrees(harvestedTrees)
  }

}