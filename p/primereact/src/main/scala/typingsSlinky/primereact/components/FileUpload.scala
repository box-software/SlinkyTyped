package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_Files
import typingsSlinky.primereact.Anon_FilesAny
import typingsSlinky.primereact.Anon_FormData
import typingsSlinky.primereact.componentsFileuploadFileUploadMod.FileUploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FileUpload
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.fileuploadMod.FileUpload] {
  @JSImport("primereact/fileupload", "FileUpload")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: accept, className, disabled, id, multiple, name, onError, onProgress, onSelect */
  def apply(
    auto: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    chooseLabel: String = null,
    customUpload: js.UndefOr[Boolean] = js.undefined,
    invalidFileSizeMessageDetail: String = null,
    invalidFileSizeMessageSummary: String = null,
    maxFileSize: Int | Double = null,
    mode: String = null,
    onBeforeSend: /* e */ Anon_FormData => Unit = null,
    onBeforeUpload: /* e */ Anon_FormData => Unit = null,
    onClear: () => Unit = null,
    onUpload: /* e */ Anon_Files => Unit = null,
    onValidationFail: /* file */ File => Unit = null,
    previewWidth: Int | Double = null,
    style: js.Object = null,
    uploadHandler: /* e */ Anon_FilesAny => Unit = null,
    uploadLabel: String = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.fileuploadMod.FileUpload] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (chooseLabel != null) __obj.updateDynamic("chooseLabel")(chooseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(customUpload)) __obj.updateDynamic("customUpload")(customUpload.asInstanceOf[js.Any])
    if (invalidFileSizeMessageDetail != null) __obj.updateDynamic("invalidFileSizeMessageDetail")(invalidFileSizeMessageDetail.asInstanceOf[js.Any])
    if (invalidFileSizeMessageSummary != null) __obj.updateDynamic("invalidFileSizeMessageSummary")(invalidFileSizeMessageSummary.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onBeforeSend != null) __obj.updateDynamic("onBeforeSend")(js.Any.fromFunction1(onBeforeSend))
    if (onBeforeUpload != null) __obj.updateDynamic("onBeforeUpload")(js.Any.fromFunction1(onBeforeUpload))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onUpload != null) __obj.updateDynamic("onUpload")(js.Any.fromFunction1(onUpload))
    if (onValidationFail != null) __obj.updateDynamic("onValidationFail")(js.Any.fromFunction1(onValidationFail))
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uploadHandler != null) __obj.updateDynamic("uploadHandler")(js.Any.fromFunction1(uploadHandler))
    if (uploadLabel != null) __obj.updateDynamic("uploadLabel")(uploadLabel.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.fileuploadMod.FileUpload] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.fileuploadMod.FileUpload](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FileUploadProps
}

