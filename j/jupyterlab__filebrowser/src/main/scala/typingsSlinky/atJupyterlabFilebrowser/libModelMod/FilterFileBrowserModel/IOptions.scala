package typingsSlinky.atJupyterlabFilebrowser.libModelMod.FilterFileBrowserModel

import typingsSlinky.atJupyterlabCoreutils.libTokensMod.IStateDB
import typingsSlinky.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typingsSlinky.atJupyterlabServices.libContentsMod.Contents.IModel
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import typingsSlinky.atPhosphorCoreutils.libJsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options
  */
trait IOptions
  extends typingsSlinky.atJupyterlabFilebrowser.libModelMod.FileBrowserModel.IOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    iconRegistry: IIconRegistry,
    manager: IDocumentManager,
    driveName: String = null,
    filter: /* value */ IModel => Boolean = null,
    refreshInterval: Int | Double = null,
    state: IStateDB[ReadonlyJSONValue] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    if (driveName != null) __obj.updateDynamic("driveName")(driveName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

