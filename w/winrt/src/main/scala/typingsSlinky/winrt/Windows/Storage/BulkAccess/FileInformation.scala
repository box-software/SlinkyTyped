package typingsSlinky.winrt.Windows.Storage.BulkAccess

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Storage.FileProperties.BasicProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.DocumentProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.ImageProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.MusicProperties
import typingsSlinky.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typingsSlinky.winrt.Windows.Storage.FileProperties.VideoProperties
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.IStorageItemProperties
import typingsSlinky.winrt.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.BulkAccess.FileInformation")
@js.native
class FileInformation ()
  extends IStorageFile
     with IStorageItemInformation
     with IStorageItemProperties {
  /* CompleteClass */
  override var basicProperties: BasicProperties = js.native
  /* CompleteClass */
  override var documentProperties: DocumentProperties = js.native
  /* CompleteClass */
  override var imageProperties: ImageProperties = js.native
  /* CompleteClass */
  override var musicProperties: MusicProperties = js.native
  /* CompleteClass */
  override var onpropertiesupdated: js.Any = js.native
  /* CompleteClass */
  override var onthumbnailupdated: js.Any = js.native
  /* CompleteClass */
  override var thumbnail: StorageItemThumbnail = js.native
  /* CompleteClass */
  override var videoProperties: VideoProperties = js.native
  /* CompleteClass */
  override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /* CompleteClass */
  override def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
}

