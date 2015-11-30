Properties:
	Title = "Rule 30"
	Dimensions = (64, 64)
	Start = {("block", (0,10)), ("block", (0, 15))}
	Generations = 64
	Interval = 0.5
	Pausable = false
	Steppable = true

type block:
	Neighborhood[3] = {4, 2, 1,
			0, VAR, 0} 
	if neighbors <= 5 then
		alive
	else
		dead
	endif
endtype