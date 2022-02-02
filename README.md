# Observer-StrategyPattern

-MCON 152 Computer Methodology
–Assignment5 Fall2021

Use the Java Observable/Observer classes to create an Observable object that provides "real-time" election statistics. For the purposes of this assignment,you can just report on any five states of your choice. The observable should return the current standings of every state which includes the number of votes for the democrat's candidate, the number of votes for the republican's candidate, and the number of electoral votes for the state.The observers need to do three things:1)Report on the popular vote2)Report on the electoral college3)Display a legal message that all reports are purely observational and not legally binding in any way, as well as the current timeThe legal message is the same for all observers. The reports on the voting will vary though, there are a few strategies they use to make their candidate look more likely to win (blaming "margin of error" or some other vague notion of imperfection if they are caught...)
Popular Vote Strategies:
1)There is a republican favoring strategy that reports 5% fewer of the democrat votes 
2)There is a democrat favoring strategy that simply ignores the state with the most republican votes
3)There is a completely honest strategy that reports the exact results

Electoral College Strategies:
1)There is a republican favoring strategy that assumes one of the states (always the same one, this should be hardcoded in) will go republican regardless of the polling data
2)There is a second republican favoring strategy that considers the state where the democrat has the smallest lead to be "too close to call" and splits the electoral votes giving half to the democrat and half to the republican (and in the event of an odd number it gives the extra vote to the republican of course)
3)There is a democrat favoring strategy that assumes that the state with the most electoral votes will go to the democrat regardless of polling data
4)There is a democrat favoring strategy that takes 2% of all republican votes in every state and makes them democrat votes instead (note that this only affects the electoral votes if there is a state within this margin)
5)There is a completely honest strategy that reports the exact resultsUse the strategy pattern to create observers that can report the election results.

Make the following five observers:
1)One that favors the republican using appropriate strategies from above
2)One that favors the democrat using appropriate strategies from above
3)One that tries to make it look like the democrat will win the popular vote but the republican will win the electoral college
4)One that reports on the electoral college honestly but favors the democrats for the popular vote
5)One that is completely honest on both the popular vote and electoral college

Which strategy you use in any given class is up to you. Unused strategies are not a problem. As far as the observable pattern, you can use push or pull, whichever you'd prefer, but include a comment that says which one you are using and how your code does this.Forthe strategy pattern, remember all of the parts that are necessary, the interfaces, abstract classes, etc. You do not need to make the strategy dynamically adjustable though of course you could. And keep in mind that these methods are relatively small, just designed for the purposes of a programming assignment, but to appreciate whatthe strategy pattern really accomplishes you have to imagine 
