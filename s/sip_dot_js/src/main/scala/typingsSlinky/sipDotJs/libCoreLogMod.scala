package typingsSlinky.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log", JSImport.Namespace)
@js.native
object libCoreLogMod extends js.Object {
  @js.native
  class Logger protected ()
    extends typingsSlinky.sipDotJs.libCoreLogLoggerMod.Logger {
    def this(logger: typingsSlinky.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: String) = this()
    def this(
      logger: typingsSlinky.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory,
      category: String,
      label: String
    ) = this()
  }
  
  @js.native
  class LoggerFactory ()
    extends typingsSlinky.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory
  
  @js.native
  object Levels extends js.Object {
    /* 3 */ val debug: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.debug with Double = js.native
    /* 0 */ val error: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.error with Double = js.native
    /* 2 */ val log: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.log with Double = js.native
    /* 1 */ val warn: typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels.warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sipDotJs.libCoreLogLevelsMod.Levels with Double] = js.native
  }
  
}

