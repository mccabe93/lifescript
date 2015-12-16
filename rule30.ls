Properties:
	Title = "Rule 30"
	Dimensions = (81, 1)
	Start = {("block", (40,0))}
	Default Type = "block"
	Generations = 30
	Interval = 0.5
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

world:
	addrow
endworld
