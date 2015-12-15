Properties:
	Title = "Conway"
	Dimensions = (10, 10)
	Start = {				("block", (2,5)), 
									("block", (3,6)), 
			("block", (4,4)),	("block", (4,5)),	("block", (4,6))}
	Default Type = "block"
	Generations = 20
	Interval = 0.5
	Pausable = false
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
