package typingsSlinky.redlock.redlockMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This error is returned when there is an error locking a resource.
  */
@JSImport("redlock", "LockError")
@js.native
class LockError () extends Error {
  def this(message: String) = this()
  var attempts: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  @JSName("name")
  val name_LockError: typingsSlinky.redlock.redlockStrings.LockError = js.native
}

