package typingsSlinky.winrtDashUwp.Windows.UI.WebUI

import typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtDashUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtDashUwp.Windows.Foundation.Collections.ValueSet
import typingsSlinky.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an activated event that fires after the app was suspended for a file open picker operation. */
@JSGlobal("Windows.UI.WebUI.WebUIFileOpenPickerContinuationEventArgs")
@js.native
abstract class WebUIFileOpenPickerContinuationEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets a set of values populated by the app before a FileOpenPicker operation that deactivates the app in order to provide context when the app is activated. */
  var continuationData: ValueSet = js.native
  /** Gets the files for which the app was activated. */
  var files: IVectorView[StorageFile] = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

