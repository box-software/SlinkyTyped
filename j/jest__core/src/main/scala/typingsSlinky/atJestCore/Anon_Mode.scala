package typingsSlinky.atJestCore

import typingsSlinky.atJestCore.atJestCoreStrings.watch
import typingsSlinky.atJestCore.atJestCoreStrings.watchAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: watch | watchAll
}

object Anon_Mode {
  @scala.inline
  def apply(mode: watch | watchAll): Anon_Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Mode]
  }
}

