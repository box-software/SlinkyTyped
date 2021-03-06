package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.AnyResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForCommitCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForCommitCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForIssueCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForIssueCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForIssueParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForIssueParamsDeprecatedNumber
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForIssueResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForPullRequestReviewCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForPullRequestReviewCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForTeamDiscussionCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForTeamDiscussionCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForTeamDiscussionParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsCreateForTeamDiscussionResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsDeleteParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForCommitCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForCommitCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForIssueCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForIssueCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForIssueParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForIssueParamsDeprecatedNumber
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForIssueResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForPullRequestReviewCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForPullRequestReviewCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForTeamDiscussionCommentParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForTeamDiscussionCommentResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForTeamDiscussionParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.ReactionsListForTeamDiscussionResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateForCommitComment extends js.Object {
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  @JSName("createForCommitComment")
  var createForCommitComment_Original: Anon_EndpointParamsPromiseReactionsCreateForCommitCommentParams = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  @JSName("createForIssueComment")
  var createForIssueComment_Original: Anon_EndpointParamsPromiseReactionsCreateForIssueCommentParams = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  @JSName("createForIssue")
  var createForIssue_Original: Anon_EndpointParamsPromiseReactionsCreateForIssueParams = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  @JSName("createForPullRequestReviewComment")
  var createForPullRequestReviewComment_Original: Anon_EndpointParamsPromiseReactionsCreateForPullRequestReviewCommentParams = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    */
  @JSName("createForTeamDiscussionComment")
  var createForTeamDiscussionComment_Original: Anon_EndpointParamsPromiseReactionsCreateForTeamDiscussionCommentParams = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    */
  @JSName("createForTeamDiscussion")
  var createForTeamDiscussion_Original: Anon_EndpointParamsPromiseReactionsCreateForTeamDiscussionParams = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsAnyResponsePromiseReactionsDeleteParams = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  @JSName("listForCommitComment")
  var listForCommitComment_Original: Anon_EndpointParamsPromiseReactionsListForCommitCommentParams = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  @JSName("listForIssueComment")
  var listForIssueComment_Original: Anon_EndpointParamsPromiseReactionsListForIssueCommentParams = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  @JSName("listForIssue")
  var listForIssue_Original: Anon_EndpointParamsPromiseReactionsListForIssueParams = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  @JSName("listForPullRequestReviewComment")
  var listForPullRequestReviewComment_Original: Anon_EndpointParamsPromiseReactionsListForPullRequestReviewCommentParams = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listForTeamDiscussionComment")
  var listForTeamDiscussionComment_Original: Anon_EndpointParamsPromiseReactionsListForTeamDiscussionCommentParams = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  @JSName("listForTeamDiscussion")
  var listForTeamDiscussion_Original: Anon_EndpointParamsPromiseReactionsListForTeamDiscussionParams = js.native
  /**
    * Create a reaction to a [commit comment](https://developer.github.com/v3/repos/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this commit comment.
    */
  def createForCommitComment(): js.Promise[Response[ReactionsCreateForCommitCommentResponse]] = js.native
  def createForCommitComment(params: RequestOptions with ReactionsCreateForCommitCommentParams): js.Promise[Response[ReactionsCreateForCommitCommentResponse]] = js.native
  /**
    * Create a reaction to an [issue](https://developer.github.com/v3/issues/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue.
    */
  def createForIssue(): js.Promise[Response[ReactionsCreateForIssueResponse]] = js.native
  def createForIssue(
    params: RequestOptions with (ReactionsCreateForIssueParams | ReactionsCreateForIssueParamsDeprecatedNumber)
  ): js.Promise[Response[ReactionsCreateForIssueResponse]] = js.native
  /**
    * Create a reaction to an [issue comment](https://developer.github.com/v3/issues/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this issue comment.
    */
  def createForIssueComment(): js.Promise[Response[ReactionsCreateForIssueCommentResponse]] = js.native
  def createForIssueComment(params: RequestOptions with ReactionsCreateForIssueCommentParams): js.Promise[Response[ReactionsCreateForIssueCommentResponse]] = js.native
  /**
    * Create a reaction to a [pull request review comment](https://developer.github.com/v3/pulls/comments/). A response with a `Status: 200 OK` means that you already added the reaction type to this pull request review comment.
    */
  def createForPullRequestReviewComment(): js.Promise[Response[ReactionsCreateForPullRequestReviewCommentResponse]] = js.native
  def createForPullRequestReviewComment(params: RequestOptions with ReactionsCreateForPullRequestReviewCommentParams): js.Promise[Response[ReactionsCreateForPullRequestReviewCommentResponse]] = js.native
  /**
    * Create a reaction to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion.
    */
  def createForTeamDiscussion(): js.Promise[Response[ReactionsCreateForTeamDiscussionResponse]] = js.native
  def createForTeamDiscussion(params: RequestOptions with ReactionsCreateForTeamDiscussionParams): js.Promise[Response[ReactionsCreateForTeamDiscussionResponse]] = js.native
  /**
    * Create a reaction to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with a `Status: 200 OK` means that you already added the reaction type to this team discussion comment.
    */
  def createForTeamDiscussionComment(): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentResponse]] = js.native
  def createForTeamDiscussionComment(params: RequestOptions with ReactionsCreateForTeamDiscussionCommentParams): js.Promise[Response[ReactionsCreateForTeamDiscussionCommentResponse]] = js.native
  /**
    * OAuth access tokens require the `write:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/), when deleting a [team discussion](https://developer.github.com/v3/teams/discussions/) or [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/).
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: RequestOptions with ReactionsDeleteParams): js.Promise[AnyResponse] = js.native
  /**
    * List the reactions to a [commit comment](https://developer.github.com/v3/repos/comments/).
    */
  def listForCommitComment(): js.Promise[Response[ReactionsListForCommitCommentResponse]] = js.native
  def listForCommitComment(params: RequestOptions with ReactionsListForCommitCommentParams): js.Promise[Response[ReactionsListForCommitCommentResponse]] = js.native
  /**
    * List the reactions to an [issue](https://developer.github.com/v3/issues/).
    */
  def listForIssue(): js.Promise[Response[ReactionsListForIssueResponse]] = js.native
  def listForIssue(
    params: RequestOptions with (ReactionsListForIssueParams | ReactionsListForIssueParamsDeprecatedNumber)
  ): js.Promise[Response[ReactionsListForIssueResponse]] = js.native
  /**
    * List the reactions to an [issue comment](https://developer.github.com/v3/issues/comments/).
    */
  def listForIssueComment(): js.Promise[Response[ReactionsListForIssueCommentResponse]] = js.native
  def listForIssueComment(params: RequestOptions with ReactionsListForIssueCommentParams): js.Promise[Response[ReactionsListForIssueCommentResponse]] = js.native
  /**
    * List the reactions to a [pull request review comment](https://developer.github.com/v3/pulls/comments/).
    */
  def listForPullRequestReviewComment(): js.Promise[Response[ReactionsListForPullRequestReviewCommentResponse]] = js.native
  def listForPullRequestReviewComment(params: RequestOptions with ReactionsListForPullRequestReviewCommentParams): js.Promise[Response[ReactionsListForPullRequestReviewCommentResponse]] = js.native
  /**
    * List the reactions to a [team discussion](https://developer.github.com/v3/teams/discussions/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listForTeamDiscussion(): js.Promise[Response[ReactionsListForTeamDiscussionResponse]] = js.native
  def listForTeamDiscussion(params: RequestOptions with ReactionsListForTeamDiscussionParams): js.Promise[Response[ReactionsListForTeamDiscussionResponse]] = js.native
  /**
    * List the reactions to a [team discussion comment](https://developer.github.com/v3/teams/discussion_comments/). OAuth access tokens require the `read:discussion` [scope](https://developer.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  def listForTeamDiscussionComment(): js.Promise[Response[ReactionsListForTeamDiscussionCommentResponse]] = js.native
  def listForTeamDiscussionComment(params: RequestOptions with ReactionsListForTeamDiscussionCommentParams): js.Promise[Response[ReactionsListForTeamDiscussionCommentResponse]] = js.native
}

