package typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesContinuousBackupsUnavailableExceptionMod

import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typingsSlinky.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousBackupsUnavailableException
  extends ServiceException[_ContinuousBackupsUnavailableExceptionDetails]
     with CreateBackupExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion {
  @JSName("name")
  var name_ContinuousBackupsUnavailableException: typingsSlinky.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ContinuousBackupsUnavailableException = js.native
}

