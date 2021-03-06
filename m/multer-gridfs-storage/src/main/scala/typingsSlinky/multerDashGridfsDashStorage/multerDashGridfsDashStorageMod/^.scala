package typingsSlinky.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.multer.multerMod._Global_.Express.Multer.File
import typingsSlinky.multerDashGridfsDashStorage.Anon_Filename
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
class ^ protected () extends MulterGridfsStorage {
  def this(configuration: DbStorageOptions) = this()
  def this(configuration: UrlStorageOptions) = this()
  /* CompleteClass */
  override def _handleFile(
    req: Request[ParamsDictionary],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[Partial[File]], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def _removeFile(req: Request[ParamsDictionary], file: File, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
}

@JSImport("multer-gridfs-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var cache: Cache = js.native
  def generateBytes(): js.Promise[Anon_Filename] = js.native
}

