Properties:
	Title = "Rule 30"
	Dimensions = (15, 6)
	Start = {("block", (0,10)), ("block", (0, 15))}
	Default Type = "block"
	Generations = 4
	Interval = 0.5
	Pausable = false
	Steppable = true

type block:
	Neighborhood[3] = {4, 2, 1,
			0, VAR, 0}
	
	if 4 <= neighbors  then
		print "neighbors is <= 4"
		if 0 == neighbors then
			dead
		else
			alive
		endif
	else
		dead
	endif
endtype
