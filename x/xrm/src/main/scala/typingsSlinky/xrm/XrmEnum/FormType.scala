package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmNumbers.`0`
import typingsSlinky.xrm.xrmNumbers.`11`
import typingsSlinky.xrm.xrmNumbers.`1`
import typingsSlinky.xrm.xrmNumbers.`2`
import typingsSlinky.xrm.xrmNumbers.`3`
import typingsSlinky.xrm.xrmNumbers.`4`
import typingsSlinky.xrm.xrmNumbers.`5`
import typingsSlinky.xrm.xrmNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of entity form states/types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmNumbers.`0`
  - typings.xrm.xrmNumbers.`1`
  - typings.xrm.xrmNumbers.`2`
  - typings.xrm.xrmNumbers.`3`
  - typings.xrm.xrmNumbers.`4`
  - typings.xrm.xrmNumbers.`6`
  - typings.xrm.xrmNumbers.`5`
  - typings.xrm.xrmNumbers.`11`
*/
trait FormType extends js.Object

object FormType {
  @scala.inline
  def BulkEdit: `6` = this.cast(6)
  @scala.inline
  def Create: `1` = this.cast(1)
  @scala.inline
  def Disabled: `4` = this.cast(4)
  /**
    * @deprecated QuickCreate has been deprecated
    */
  @scala.inline
  def QuickCreate: `5` = this.cast(5)
  @scala.inline
  def ReadOnly: `3` = this.cast(3)
  /**
    * @deprecated ReadOptimized has been deprecated.
    */
  @scala.inline
  def ReadOptimized: `11` = this.cast(11)
  @scala.inline
  def Undefined: `0` = this.cast(0)
  @scala.inline
  def Update: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

