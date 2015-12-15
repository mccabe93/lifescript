Properties:
	Title = "Rule 30"
	Dimensions = (81, 1)
	Start = {("block", (0,40))}
	Default Type = "block"
	Generations = 20
	Interval = 0.5
	Pausable = false
	Steppable = true


type block:
	Neighborhood[3] = {4, 2, 1,
			0, VAR, 0}


	if  neighbors that are "block" < 5 then
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
