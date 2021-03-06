package typingsSlinky.overwatchDashApi

import typingsSlinky.overwatchDashApi.overwatchDashApiMod.QuickplayCompetitiveStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assists extends js.Object {
  var assists: QuickplayCompetitiveStats
  var average: QuickplayCompetitiveStats
  var best: QuickplayCompetitiveStats
  var combat: QuickplayCompetitiveStats
  var game: QuickplayCompetitiveStats
  var match_awards: QuickplayCompetitiveStats
  var miscellaneous: QuickplayCompetitiveStats
  var top_heroes: Anon_CompetitiveQuickplayAnonEliminationsperlife
}

object Anon_Assists {
  @scala.inline
  def apply(
    assists: QuickplayCompetitiveStats,
    average: QuickplayCompetitiveStats,
    best: QuickplayCompetitiveStats,
    combat: QuickplayCompetitiveStats,
    game: QuickplayCompetitiveStats,
    match_awards: QuickplayCompetitiveStats,
    miscellaneous: QuickplayCompetitiveStats,
    top_heroes: Anon_CompetitiveQuickplayAnonEliminationsperlife
  ): Anon_Assists = {
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], average = average.asInstanceOf[js.Any], best = best.asInstanceOf[js.Any], combat = combat.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], match_awards = match_awards.asInstanceOf[js.Any], miscellaneous = miscellaneous.asInstanceOf[js.Any], top_heroes = top_heroes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Assists]
  }
}

