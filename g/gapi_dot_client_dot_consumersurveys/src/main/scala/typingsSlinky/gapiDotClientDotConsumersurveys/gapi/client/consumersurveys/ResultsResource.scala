package typingsSlinky.gapiDotClientDotConsumersurveys.gapi.client.consumersurveys

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotConsumersurveys.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultsResource extends js.Object {
  /**
    * Retrieves any survey results that have been produced so far. Results are formatted as an Excel file. You must add "?alt=media" to the URL as an
    * argument to get results.
    */
  def get(request: Anon_AltFieldsKey): Request[SurveyResults]
}

object ResultsResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKey => Request[SurveyResults]): ResultsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ResultsResource]
  }
}

