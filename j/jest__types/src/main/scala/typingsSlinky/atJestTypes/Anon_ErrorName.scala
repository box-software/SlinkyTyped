package typingsSlinky.atJestTypes

import typingsSlinky.atJestTypes.atJestTypesStrings.error_
import typingsSlinky.atJestTypes.buildCircusMod.Event
import typingsSlinky.atJestTypes.buildCircusMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorName extends Event {
  var error: Exception
  var name: error_
}

object Anon_ErrorName {
  @scala.inline
  def apply(error: Exception, name: error_): Anon_ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrorName]
  }
}

