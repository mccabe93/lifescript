Properties:
	Title = "Conway's Game of Life"
	Cell Size = (10, 10)
	Dimensions = (12, 12)
	// The glider gun shown on the Wikipedia page
	Start = {("block", (2,9)),("block", (3,9)),("block", (2,10)),("block", (3,10))}
	Default Type = "block"
	Generations = 1
	Interval = 0.10
	Pausable = true
	Steppable = true

type block:
	Neighborhood[3] = {	1,	1, 	1,
				1,	VAR,	1,
				1,	1, 	1	}

	if alive then
		if((neighbors == 2) | (neighbors == 3)) then
			alive
		else
			dead
		endif
	else
		if neighbors == 3 then
			alive
		endif
	endif
endtype
