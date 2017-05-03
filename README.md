# Senior DevOps Engineer Mt Fuji

This is a take-home programming assignment as part of the Ping Identity interview
process. Feel free to clone this repo, but _please_ delete any submitted answers
after the interview, so that we can re-use the problem.

## Problem:

Ping Identity has announced the acquisition of `phantomjs.com`, in order to better align Ping Identity's
vision of a identity-defined security with ... headless JavaScript browser technology. The key is: don't think
about it too much, Morty.

Turns out nobody knows much about this site. We want to know what paths are reachable from a 
search engine. We didn't bother keeping any of the web developers on that product, because eww...

Your assignment is to write a webcrawler. It should 'crawl' `phantomjs.com` and print out
all of the unique paths you can click around in resulting in an html document.

Do not worry about links reachable through 'onclick' handlers or other JavaScript
magic. We only care about what the search engines care about: `href` attributes
on anchor (`a`) tags. Ignore everything else. In addition we only care about
pages on the `phantomjs.com` domain and no other assets.

Processing HTML and JavaScript is not really the focus of this assignment, so we've provided
an example of how to use PhantomJS itself to make these requests, see `App.java`. The focus here is 
on the design of the crawler.

This will require you to install PhantomJS. You're applying for a senior position though, so we'll
expect you'll figure that part out.

You have enough to get started with gradle:

```
gradle test
```

It's sufficient to just write a test which does the crawling.

This assignment should take about three to eight hours and we typically give you a weekend
to complete it. This is meant to be a place where you can show your problem
solving and software engineering talent, so place your best foot forward. You will
be assessed on code and design quality, as well as correctness of your solution.

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
* phantomjs
* junit or spock or your favorite testing framework
