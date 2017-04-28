# Senior DevOps Engineer Mt Fuji

This is a take-home programming assignment as part of the Ping Identity interview
process. Feel free to clone this repo, but _please_ delete any submitted answers
after the interview, so that we can re-use the problem.

## Problem:

Oh dear. The development team for `pingidentity.com` all left! Now we're in charge of it. Our marketing
department wants to know what URLs are reachable by clicking around in `pingidentity.com`. This will
help them identify which pages they've created are friendly to a web-crawler. Definitely not because
it's some technical test for hiring new Sr DevOps engineers. No sir.

Your assignment is to write a webcrawler. It should 'crawl' the site and print out
all of the unique paths you can click around in resulting in an html document.

Do not worry about links reachable through 'onclick' handlers or other JavaScript
magic. We only care about what the search engines care about: `href` attributes
on anchor (`a`) tags. Ignore everything else. In addition we only care about
pages on the `pingidentity.com` domain and no other assets.

`pingidentity.com` uses react to render, so we'll need to use Webdriver to end up with
usable html. `App.java` contains an example of how you can use this - the exercise
is more intended to evaluate how to crawl from one page to another, not HTML
processing.

Note that `pingidentity.com` contains links to zip files and pdfs - don't visit these
to try to get links, we only care about html.

You have enough to get started with gradle:

```
gradle test
```

This assignment should take about three hours and we typically give you a weekend
to complete. This is meant to be a place where you can show your problem
solving and software engineering talent, so place your best foot forward.

If you have any questions, feel free to ask through your Ping contact.

This coding exercise will be used in a panel interview, so be prepared to discuss
it there and talk about the decisions you've made. Remember to document any
assumptions (in code preferably) you may be making.

## Submitting:

To submit your answer, open a merge request, or simply zip up the archive and send them back to your Ping contact.

## FAQ

**Q: Am I required to complete this?**

**A:** Well, no. We prefer take home exercises because they are representative
of the type of work you'll be doing, and we have a need to assess your problem
solving and engineering expertise. However we also realize that this is an
investment of your time. If you really prefer not to do a take-home exercise, as an alternative,
you can do programming assignments on a whiteboard in your panel interview,
as well as pointing us to code you've written in the past (on github for example) to
showcase your work. This is not our first preference, because it is not indicative
of the work you'll be doing (we do not code on whiteboards at Ping) and whiteboard
programming in an interview can be very intimidating if you're not prepared. It
is your call though.

**Q: Why is this called a fuji?**

**A:** No idea. That's what we call take-home coding assignments at Ping. I think
it originated from a Microsoft way of interviewing where they'd ask you how
you would move Mt Fuji. Apparently those sorts of problems are a terrible way
to assess whether someone would succeed at Microsoft so they've discontinued it,
but we liked the name so we kept it.


## Required Tools
* git
* groovy
* gradle
* junit or spock or your favorite testing framework
