Properties:
	Title = "Rule 30"
	Dimensions = (13, 3)
	Start = {("block", (0,6))}
	Default Type = "block"
	Generations = 4
	Interval = 0.5
	Pausable = false
	Steppable = true

type block:
	Neighborhood[3] = {4, 2, 1,
			0, VAR, 0}
	nebs = neighbors
	if 0 <= nebs then
		print nebs
	endif
	if neighbors <= 4 then
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
