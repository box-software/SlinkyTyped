package typingsSlinky.eslint.eslintMod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.eslintNumbers.`0`
  - typings.eslint.eslintNumbers.`1`
  - typings.eslint.eslintNumbers.`2`
  - typings.eslint.eslintStrings.off
  - typings.eslint.eslintStrings.warn
  - typings.eslint.eslintStrings.error
*/
trait RuleLevel extends js.Object

object RuleLevel {
  @scala.inline
  def `0`: typingsSlinky.eslint.eslintNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typingsSlinky.eslint.eslintNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typingsSlinky.eslint.eslintNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.eslint.eslintStrings.error = this.cast("error")
  @scala.inline
  def off: typingsSlinky.eslint.eslintStrings.off = this.cast("off")
  @scala.inline
  def warn: typingsSlinky.eslint.eslintStrings.warn = this.cast("warn")
}

