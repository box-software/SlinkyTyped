package typingsSlinky.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.alternate
  - typings.csstype.csstypeStrings.`alternate-reverse`
  - typings.csstype.csstypeStrings.normal
  - typings.csstype.csstypeStrings.reverse
*/
trait SingleAnimationDirection
  extends _SingleAnimation
     with _AnimationDirectionProperty

object SingleAnimationDirection {
  @scala.inline
  def alternate: typingsSlinky.csstype.csstypeStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typingsSlinky.csstype.csstypeStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsSlinky.csstype.csstypeStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typingsSlinky.csstype.csstypeStrings.reverse = this.cast("reverse")
}

