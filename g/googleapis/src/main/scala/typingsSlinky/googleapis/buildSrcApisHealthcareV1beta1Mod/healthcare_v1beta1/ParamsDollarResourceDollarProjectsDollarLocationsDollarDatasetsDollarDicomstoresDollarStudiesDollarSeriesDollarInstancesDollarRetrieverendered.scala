package typingsSlinky.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarDicomstoresDollarStudiesDollarSeriesDollarInstancesDollarRetrieverendered extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS,
    * or QIDO-RS standard (e.g.,
    * `studies/{study_id}/series/{series_id}/instance/{instance_id}/rendered`).
    */
  var dicomWebPath: js.UndefOr[String] = js.native
  /**
    * The name of the DICOM store that is being accessed (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    */
  var parent: js.UndefOr[String] = js.native
}

