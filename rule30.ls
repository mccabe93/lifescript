Properties:
	Title = "Rule 30"
	Dimensions = (3, 3)
	Start = {("block", (0,2))}
	Default Type = "block"
	Generations = 4
	Interval = 0.5
	Pausable = false
	Steppable = true

type block:
	Neighborhood[3] = {4, 2, 1,
			0, VAR, 0}
	nebs = neighbors
	print "neighbor value = ", nebs
	if 4 <= nebs  then
		print "neighbors is >= 4"
		if 0 == nebs then
			dead
		else
			alive
			print "setting cell alive"
		endif
	else
		dead
	endif
endtype
