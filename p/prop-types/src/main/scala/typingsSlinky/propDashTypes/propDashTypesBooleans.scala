package typingsSlinky.propDashTypes

import typingsSlinky.propDashTypes.propDashTypesMod.IsOptional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object propDashTypesBooleans {
  @js.native
  sealed trait `false`
    extends IsOptional[js.Any]
  
  @js.native
  sealed trait `true`
    extends IsOptional[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

