package typingsSlinky.atNodelibFsDotScandir

import typingsSlinky.atNodelibFsDotScandir.outTypesMod.Dirent
import typingsSlinky.atNodelibFsDotScandir.outTypesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/utils", JSImport.Namespace)
@js.native
object outUtilsMod extends js.Object {
  @js.native
  object fs extends js.Object {
    def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
  }
  
}

