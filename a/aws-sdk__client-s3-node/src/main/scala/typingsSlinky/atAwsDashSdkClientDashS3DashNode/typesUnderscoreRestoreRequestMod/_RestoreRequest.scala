package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRestoreRequestMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Bulk
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Expedited
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.SELECT
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Standard_
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGlacierJobParametersMod._GlacierJobParameters
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOutputLocationMod._OutputLocation
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreSelectParametersMod._SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RestoreRequest extends js.Object {
  /**
    * <p>Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.</p>
    */
  var Days: js.UndefOr[Double] = js.undefined
  /**
    * <p>The optional description for the job.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * <p>Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.</p>
    */
  var GlacierJobParameters: js.UndefOr[_GlacierJobParameters] = js.undefined
  /**
    * <p>Describes the location where the restore job's output is stored.</p>
    */
  var OutputLocation: js.UndefOr[_OutputLocation] = js.undefined
  /**
    * <p>Describes the parameters for Select job types.</p>
    */
  var SelectParameters: js.UndefOr[_SelectParameters] = js.undefined
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: js.UndefOr[Standard_ | Bulk | Expedited | String] = js.undefined
  /**
    * <p>Type of restore request.</p>
    */
  var Type: js.UndefOr[SELECT | String] = js.undefined
}

object _RestoreRequest {
  @scala.inline
  def apply(
    Days: Int | Double = null,
    Description: String = null,
    GlacierJobParameters: _GlacierJobParameters = null,
    OutputLocation: _OutputLocation = null,
    SelectParameters: _SelectParameters = null,
    Tier: Standard_ | Bulk | Expedited | String = null,
    Type: SELECT | String = null
  ): _RestoreRequest = {
    val __obj = js.Dynamic.literal()
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlacierJobParameters != null) __obj.updateDynamic("GlacierJobParameters")(GlacierJobParameters.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RestoreRequest]
  }
}

