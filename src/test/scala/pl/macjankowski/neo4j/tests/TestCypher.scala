package pl.macjankowski.neo4j.tests

import org.anormcypher.Cypher
import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * @author "Maciej Jankowski <mac.rarry@gmail.com>"
 *
 */
class TestCypher extends FunSpec with ShouldMatchers {

  describe("Cypher should be able to query neo4j") {

//    it("should create a graph") {
//      // create some test nodes
//      Cypher("""create (anorm {name:"AnormCypher"}), (test {name:"Test"})""").execute()
//
//    }

    it("should retrieve nodes") {
      // a simple query
      val req = Cypher("start n=node(*) return n.name")

      // get a stream of results back
      val stream = req()

      // get the results and put them into a list
      val ret = stream.map(row => { row[String]("n.name") }).toList

      ret foreach println
    }
  }
}