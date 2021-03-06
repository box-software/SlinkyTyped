package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFSoftwarePlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFilesVersion extends js.Object {
  var Build: Double
  val Display: String
  var Major: Double
  var Minor: Double
  var Patch: Double
  var SoftwarePlatform: MFSoftwarePlatformType
  def Clone(): IMFilesVersion
  def CompareTo(RightSide: IMFilesVersion): Double
}

object IMFilesVersion {
  @scala.inline
  def apply(
    Build: Double,
    Clone: () => IMFilesVersion,
    CompareTo: IMFilesVersion => Double,
    Display: String,
    Major: Double,
    Minor: Double,
    Patch: Double,
    SoftwarePlatform: MFSoftwarePlatformType
  ): IMFilesVersion = {
    val __obj = js.Dynamic.literal(Build = Build.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CompareTo = js.Any.fromFunction1(CompareTo), Display = Display.asInstanceOf[js.Any], Major = Major.asInstanceOf[js.Any], Minor = Minor.asInstanceOf[js.Any], Patch = Patch.asInstanceOf[js.Any], SoftwarePlatform = SoftwarePlatform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMFilesVersion]
  }
}

