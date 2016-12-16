Properties:
	Title = "Rule 30"
	Cell Size = (10, 10)
	Dimensions = (7, 2)
	Start = {("block", (3,0))}
	Default Type = "block"
	Generations = 64
	Interval = 0.5
	Pausable = true

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

def printo():
	print "shmoikus"
enddef

// Each generation we add a row.
world:
	printo()
	addrow
endworld
