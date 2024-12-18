up:
	docker compose up

down:
	docker compose down

up_build: build_theatre build_auth build_notification
	docker compose up

build_theatre:
	cd theatre-service && docker compose build

build_auth:
	cd auth-service && docker compose build

build_discovery:
	cd discovery-service &&	docker compose build

build_notification:
	cd notification-service && docker compose build
