package typingsSlinky.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextSettings {
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.active
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.error
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.percent
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.ratio
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.success
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.warning
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, active | error | success | warning | percent | ratio]) with (Partial[Pick[_Impl, active | error | success | warning | percent | ratio]])
}
