package typingsSlinky.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArtifactSource extends js.Object {
  @JSName("package")
  var _package: Double
  var artifactSource: Double
  var containerImage: Double
  var pullRequest: Double
  var schedule: Double
  var sourceRepo: Double
  var undefined: Double
}

object Anon_ArtifactSource {
  @scala.inline
  def apply(
    _package: Double,
    artifactSource: Double,
    containerImage: Double,
    pullRequest: Double,
    schedule: Double,
    sourceRepo: Double,
    undefined: Double
  ): Anon_ArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource.asInstanceOf[js.Any], containerImage = containerImage.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], sourceRepo = sourceRepo.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArtifactSource]
  }
}

