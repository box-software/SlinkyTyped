package typingsSlinky.atJestTypes

import typingsSlinky.atJestTypes.atJestTypesStrings.test_start
import typingsSlinky.atJestTypes.buildCircusMod.Event
import typingsSlinky.atJestTypes.buildCircusMod.TestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTestTeststart extends Event {
  var name: test_start
  var test: TestEntry
}

object Anon_NameTestTeststart {
  @scala.inline
  def apply(name: test_start, test: TestEntry): Anon_NameTestTeststart = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NameTestTeststart]
  }
}

