This is a game for two players where, taking it in turns, the winner is the player that succeeds in forming a line of four discs of the same colour.

The rules of the game are very simple. The board consists of a six row by seven column grid. Each player takes a turn with a single coloured disc (yellow or red) that they slot into the top of any of the non-full columns.

The disc then falls either to the bottom row or lands on top of another disc of either colour. The winner is the player who is the first to create/form a contiguous line of four discs of their allocated colour. This line can be horizontal, vertical or diagonal. If the board becomes full and there is no winner then the game is drawn. It is assumed that the red player always goes first.

Note the following:

1) A board will be represented as a six (6) row by seven (7) column character array. The top of the board (where the player discs are inserted) is the first row of the array. Note that row and column numbers start at 0 (zero).

2) The board can only contain the characters ‘Y’, ‘R’ and ‘.’ (full stop). Where ‘Y’
indicates a yellow disc, ‘R’ a red disc and ‘.’ an empty [free] square [space]. Note that ‘y’ and ‘r’ (lowercase) would be deemed invalid.

3) An invalid board is defined as a configuration that could not occur during a game, e.g. a board containing only yellow discs or an empty square below a coloured disc.

Tasks:
1.) Write a method, that returns true or false depending on whether a character (char) [the input] is a valid board square as defined/described above.

2.) Write a method that returns true if the input board is a valid board (as defined/described above), return false otherwise.

3.) Write a method that when given an input column number returns true or false depending on whether a move (by either player) could be made in that column.

4.) Write a method that returns a list of all the column numbers that a move could be made into.

5.) Write a method that when given a board layout as input, returns ‘R’ if it is now Red’s move, ‘Y’ for Yellow’s go or ‘.’ if the board is invalid (as defined/described above).