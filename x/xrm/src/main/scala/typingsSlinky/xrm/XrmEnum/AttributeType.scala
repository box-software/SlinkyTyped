package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.boolean
import typingsSlinky.xrm.xrmStrings.datetime
import typingsSlinky.xrm.xrmStrings.decimal
import typingsSlinky.xrm.xrmStrings.double
import typingsSlinky.xrm.xrmStrings.integer
import typingsSlinky.xrm.xrmStrings.lookup
import typingsSlinky.xrm.xrmStrings.memo
import typingsSlinky.xrm.xrmStrings.money
import typingsSlinky.xrm.xrmStrings.multioptionset
import typingsSlinky.xrm.xrmStrings.optionset
import typingsSlinky.xrm.xrmStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Attribute types for {@link Attributes.Attribute.setDisplayState()}.
  * @see {@link Xrm.Attributes.AttributeType}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.boolean
  - typings.xrm.xrmStrings.datetime
  - typings.xrm.xrmStrings.decimal
  - typings.xrm.xrmStrings.double
  - typings.xrm.xrmStrings.integer
  - typings.xrm.xrmStrings.lookup
  - typings.xrm.xrmStrings.memo
  - typings.xrm.xrmStrings.money
  - typings.xrm.xrmStrings.multioptionset
  - typings.xrm.xrmStrings.optionset
  - typings.xrm.xrmStrings.string
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def Boolean: boolean = this.cast("boolean")
  @scala.inline
  def DateTime: datetime = this.cast("datetime")
  @scala.inline
  def Decimal: decimal = this.cast("decimal")
  @scala.inline
  def Double: double = this.cast("double")
  @scala.inline
  def Integer: integer = this.cast("integer")
  @scala.inline
  def Lookup: lookup = this.cast("lookup")
  @scala.inline
  def Memo: memo = this.cast("memo")
  @scala.inline
  def Money: money = this.cast("money")
  @scala.inline
  def MultiOptionSet: multioptionset = this.cast("multioptionset")
  @scala.inline
  def OptionSet: optionset = this.cast("optionset")
  @scala.inline
  def String: string = this.cast("string")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

