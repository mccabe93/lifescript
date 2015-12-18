Properties:
	Title = "Rule 30"
	Dimensions = (101, 1)
	Start = {("block", (50,0))}
	Default Type = "block"
	Generations = 64
	Interval = 0.1
	Pausable = true
	Steppable = false

type block:
	Neighborhood[3] = {4, 2, 1,
			0, VAR, 0}

	if neighbors < 5 then
		if neighbors == 0 then
			if alive then
				alive
			else
				dead
			endif
		else
			alive
		endif
	else
		dead
	endif
endtype

// Each generation we add a row.
world:
	addrow
endworld
